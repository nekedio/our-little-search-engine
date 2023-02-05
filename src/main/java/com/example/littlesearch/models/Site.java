package com.example.littlesearch.models;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.sql.Timestamp;

@Setter
@Getter
@RequiredArgsConstructor
public class Site {
    @NotNull
    private final int id;
    @NotNull
    private Status status;
    @NotNull
    private Timestamp statusTime;
    @Nullable
    private String lastError;
    private final String url;
    private final String name;
}
