
package com.fc.controller;

import com.fc.entity.MessageBoardWithBLOBs;
import com.fc.service.MsgBoardService;
import com.fc.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("msgboard")
public class MsgBoardController {
    @Autowired
    private MsgBoardService msgBoardService;

    @PostMapping("add")
    public ResultVO add(@RequestBody MessageBoardWithBLOBs msgBoard) {
        return msgBoardService.add(msgBoard);
    }

    @GetMapping("delete")
    public ResultVO delete(@RequestParam Long id) {
        return msgBoardService.delete(id);
    }

    @PostMapping("update")
    public ResultVO update(@RequestBody MessageBoardWithBLOBs msgBoard) {
        return msgBoardService.update(msgBoard);
    }

    @GetMapping("getlist")
    public ResultVO getlist(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                            @RequestParam(value = "pageSize", defaultValue = "3")  Integer pageSize,
                            Long id) {
        return msgBoardService.getList(pageNum, pageSize, id);
    }
}