package com.example.app.domain;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JournalClass {
	Integer journalId;
    String journalTitle;
    Timestamp journalCreated;
}
