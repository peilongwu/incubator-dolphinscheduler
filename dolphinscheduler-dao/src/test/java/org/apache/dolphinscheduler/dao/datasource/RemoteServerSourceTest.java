/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.dolphinscheduler.dao.datasource;

import org.junit.Before;
import org.junit.Test;

public class RemoteServerSourceTest {

    private RemoteServerSource remoteServerSource;

    @Before
    public void before() throws Exception {
        remoteServerSource = new RemoteServerSource();
    }

    @Test
    public void testDriverClassSelector() {
        remoteServerSource.dbTypeSelector();
    }

    @Test
    public void testDbTypeSelector() {
        remoteServerSource.dbTypeSelector();
    }

    @Test
    public void testGetHost() {
        remoteServerSource.getHost();
    }

    @Test
    public void testSetHost() {
        remoteServerSource.setHost("");
    }

    @Test
    public void testGetPort() {
        remoteServerSource.getPort();
    }

    @Test
    public void testSetPort() {
        remoteServerSource.setPort("22");
    }

}
