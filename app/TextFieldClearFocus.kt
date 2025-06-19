val focusManager = LocalFocusManager.current
val keyboardController = LocalSoftwareKeyboardController.current

// This will hide keyboard without click effect, make sure to put this in LazyColumn or main Boxes
.pointerInput(Unit) {
    detectTapGestures {
        focusManager.clearFocus()
        keyboardController?.hide()
    }
}