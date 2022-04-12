package com.fc.service;

import com.fc.entity.MessageBoardWithBLOBs;
import com.fc.vo.ResultVO;

public interface MsgBoardService {
    ResultVO add(MessageBoardWithBLOBs msgBoard);

    ResultVO delete(Long id);

    ResultVO update(MessageBoardWithBLOBs msgBoard);

    ResultVO getList(Integer pageNum, Integer pageSize, Long id);
}