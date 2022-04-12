package com.fc.service.impl;

import com.fc.dao.MessageBoardMapper;
import com.fc.entity.MessageBoardWithBLOBs;
import com.fc.service.MsgBoardService;
import com.fc.vo.DataVO;
import com.fc.vo.ResultVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class MsgBoardServiceImpl implements MsgBoardService {

    @Autowired
    private MessageBoardMapper msgBoardMapper;

    @Override
    public ResultVO add(MessageBoardWithBLOBs msgBoard) {
        ResultVO resultVO;

        if (msgBoard.getCreateTime() == null) {
            msgBoard.setCreateTime(new Date());
        }

        int affectedRows = msgBoardMapper.insertSelective(msgBoard);

        if (affectedRows > 0) {
            resultVO = new ResultVO(2000, "留言成功", true, msgBoard);
        } else {
            resultVO = new ResultVO(4000, "留言错误", false, null);
        }

        return resultVO;
    }

    @Override
    public ResultVO delete(Long id) {
        ResultVO resultVO;

        int affectedRows = msgBoardMapper.deleteByPrimaryKey(id);

        if (affectedRows > 0) {
            resultVO = new ResultVO(2000, "删除留言成功", true, null);
        } else {
            resultVO = new ResultVO(4000, "删除留言失败", false, null);

        }
        return resultVO;
    }

    @Override
    public ResultVO update(MessageBoardWithBLOBs msgBoard) {
        ResultVO resultVO;

        int affectedRows = msgBoardMapper.updateByPrimaryKeyWithBLOBs(msgBoard);

        if (affectedRows > 0) {
            msgBoard = msgBoardMapper.selectByPrimaryKey(msgBoard.getId());

            resultVO = new ResultVO(2000, "更新留言成功", true, msgBoard);
        } else {
            resultVO = new ResultVO(4000, "更新留言失败", false, null);
        }

        return resultVO;
    }

    @Override
    public ResultVO getList(Integer pageNo, Integer pageSize, Long id) {
        ResultVO resultVO;

        DataVO<MessageBoardWithBLOBs> dataVo;

        List<MessageBoardWithBLOBs> msgBoards;

        if (id != null) {
            msgBoards = new ArrayList<>();

            MessageBoardWithBLOBs msgBoard = msgBoardMapper.selectByPrimaryKey(id);

            if (msgBoard == null) {
                dataVo = new DataVO<>(0L, msgBoards, pageNo, pageSize);

                resultVO = new ResultVO(4100, "没有查到此留言", false, dataVo);
            } else {
                msgBoards.add(msgBoard);

                dataVo = new DataVO<>(1L, msgBoards, pageNo, pageSize);

                resultVO = new ResultVO(2100, "查到了此留言", true, dataVo);
            }

        } else {
            PageHelper.startPage(pageNo, pageSize);

            msgBoards = msgBoardMapper.selectByExampleWithBLOBs(null);

            //如果数据库为空
            if (msgBoards.size() == 0) {
                dataVo = new DataVO<>(0L, msgBoards, pageNo, pageSize);

                resultVO = new ResultVO(4200, "没有留言信息", false, dataVo);
            } else {
                PageInfo<MessageBoardWithBLOBs> pageInfo = new PageInfo<>();

                dataVo = new DataVO<>(pageInfo.getTotal(), msgBoards, pageNo, pageSize);

                resultVO = new ResultVO(2200, "留言信息查询成功", true, dataVo);
            }

        }

        return resultVO;
    }
}