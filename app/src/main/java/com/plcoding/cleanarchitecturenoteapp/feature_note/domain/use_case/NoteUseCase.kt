package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.use_case

/**
 * Main UseCase
 */
class NoteUseCase(
    val getNotesUseCase: GetNotesUseCase,
    val deleteNoteUseCase: DeleteNoteUseCase,
    val addNoteUseCase: AddNoteUseCase
) {
}