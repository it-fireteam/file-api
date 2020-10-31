package it.fireteam.fileapi.ws.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Response {
    private Integer code;
    private String result;
}
