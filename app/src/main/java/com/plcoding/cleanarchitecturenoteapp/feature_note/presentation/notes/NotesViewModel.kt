package com.plcoding.cleanarchitecturenoteapp.feature_note.presentation.notes

import androidx.lifecycle.ViewModel
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.use_case.NoteUseCase
import javax.inject.Inject

class NotesViewModel @Inject constructor(
    private val noteUseCase: NoteUseCase
) : ViewModel() {
    private val _state = mutablaStateOf(NotesState())

    fun onEvent(event: NotesEvent) {
        when (event) {
            is NotesEvent.Order -> {

            }
            is NotesEvent.DeleteNote -> {

            }
            is NotesEvent.RestoreNote -> {

            }
            is NotesEvent.ToggleOrderSection -> {

            }
        }
    }
}