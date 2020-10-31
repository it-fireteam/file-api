package it.fireteam.fileapi.ws.service;

import it.fireteam.fileapi.ws.model.Response;

public interface FileService {
    Response unpack(String path);
}
