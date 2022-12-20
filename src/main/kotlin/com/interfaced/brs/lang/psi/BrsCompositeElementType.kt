package com.interfaced.brs.lang.psi

import com.intellij.psi.tree.IElementType
import com.interfaced.brs.lang.BrsLanguage

class BrsCompositeElementType(expr: String) : IElementType(expr, BrsLanguage.INSTANCE)