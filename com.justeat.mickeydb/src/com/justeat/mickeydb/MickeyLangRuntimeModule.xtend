/*
 * generated by Xtext 2.10.0
 */
package com.justeat.mickeydb

import com.google.inject.Binder
import com.justeat.mickeydb.scoping.MickeyLangScopeProvider

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class MickeyLangRuntimeModule extends AbstractMickeyLangRuntimeModule {
	
	override configure(Binder binder) {
		super.configure(binder)
		binder.bind(MickeyEnvironment);
	}
    
	override bindIQualifiedNameProvider() {
		typeof(MickeyNameProvider)
	}
	
	override bindIScopeProvider() {
		typeof(MickeyLangScopeProvider)
	}
	
}
