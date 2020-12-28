package com.jjh.props

class GameObject {
    var x = 0
        get() {
            return field // implicit backing field generated for you
        }
        set(value) {
            if (value >= 0) {
                field = value
            }
        }

    var y: Int = 0
        get() {
            return field
        }
        set(value) {
            if (value >= 0) {
                field = value
            }
        }

    // Doesn't use a backing field but looks like a property
    val isHome: Boolean
        get() {
            return false
        }

    // Can explicitly specify own backing field
    private var _background: String? = null
    val background: String?
        get() {
            if (_background == null) {
                _background = "blue"
            }
            return _background
        }

}