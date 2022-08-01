package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.use_case

class NoteUseCase(
    val getNotes: GetNotesUseCase,
    val deleteNoteUseCase: DeleteNoteUseCase
) {
}