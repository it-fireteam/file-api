package it.fireteam.fileapi.ws.service;

import it.fireteam.fileapi.ws.model.Response;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Log4j2
public class FileServiceImpl implements FileService{

    @Override
    public Response unpack(String path) {
        log.info("Unpacking: {}", path);
        //ToDo Logic here
        return new Response(0, "OK");
    }
}
