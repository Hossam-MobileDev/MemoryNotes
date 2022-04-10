package com.examples.core.usecase

import com.examples.core.data.Note
import com.examples.core.repository.NoteRepository

class AddNote(private val noteRepository: NoteRepository) {
    suspend operator fun invoke(note: Note) = noteRepository.addNote(note)
}