package it.fireteam.fileapi.ws.controller;

import it.fireteam.fileapi.ws.model.Response;
import it.fireteam.fileapi.ws.service.FileService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("files")
@AllArgsConstructor
public class FileController {

    private final FileService fileService;

    @GetMapping(name = "/unpack", produces = "application/json")
    public @ResponseBody Response getBook(@RequestParam String path) {
        return fileService.unpack(path);
    }
}
