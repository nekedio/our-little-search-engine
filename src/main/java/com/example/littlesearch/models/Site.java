package com.example.littlesearch.models;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.sql.Timestamp;

@Setter
@Getter
@RequiredArgsConstructor
@EqualsAndHashCode
public class Site {
    @NotNull
    private final int id;
    @NotNull
    private Status status;
    @NotNull
    private Timestamp statusTime;
    @Nullable
    private String lastError;
    @NotNull
    private final String url;
    @NotNull
    private final String name;
    @Override
    public String toString() {
        return "Site{" +
                "id=" + id +
                ", status=" + status +
                ", statusTime=" + statusTime +
                ", lastError='" + lastError + '\'' +
                ", url='" + url + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
