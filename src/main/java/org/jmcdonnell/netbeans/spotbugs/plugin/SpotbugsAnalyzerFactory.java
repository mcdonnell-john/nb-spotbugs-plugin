/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.jmcdonnell.netbeans.spotbugs.plugin;  

import javax.swing.JComponent;
import org.netbeans.modules.analysis.spi.Analyzer;
import org.netbeans.modules.analysis.spi.Analyzer.AnalyzerFactory;
import org.openide.util.ImageUtilities;
import org.openide.util.lookup.ServiceProvider;

/**
 *
 * @author John McDonnell
 */
@ServiceProvider(service=AnalyzerFactory.class)
public class SpotbugsAnalyzerFactory extends AnalyzerFactory {

    public SpotbugsAnalyzerFactory() {
        super("spotbugs", "Spotbugs", ImageUtilities.loadImage("")); //TODO get image
    }

    @Override
    public Iterable<? extends Analyzer.WarningDescription> getWarnings() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public <D, C extends JComponent> Analyzer.CustomizerProvider<D, C> getCustomizerProvider() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Analyzer createAnalyzer(Analyzer.Context context) {
        return new SpotbugsAnalyzer(context);
    }
}
