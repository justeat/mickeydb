package com.justeat.mickeydb.generator;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;

public interface IGenerator2 extends IGenerator {
    /**
     * @param input - the input for which to generate resources
     * @param fsa - file system access to be used to generate files
     */
    public void doGenerate(ResourceSet input, IFileSystemAccess fsa);
}
