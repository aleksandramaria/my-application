package com.crud.tasks.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Badges {
    private int votes;
    private AttachmentsByType attachments;
}
