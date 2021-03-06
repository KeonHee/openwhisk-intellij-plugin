/**
 * Copyright 2020-present NAVER Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.navercorp.openwhisk.intellij.common.utils.whisk;

import com.navercorp.openwhisk.intellij.common.utils.WhiskUtils;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WhiskUtilsTest {
    @Test
    public void testWhiskUtils_getApihHostWithProtocol() {
        String expected1 = "https://foo.com";
        String expected2 = "http://foo.com";

        Assert.assertEquals(expected1, WhiskUtils.getApihHostWithProtocol("foo.com"));
        assertEquals(expected2, WhiskUtils.getApihHostWithProtocol("http://foo.com"));
    }
}
