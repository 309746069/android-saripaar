/*
 * Copyright (C) 2014 Mobs & Geeks
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.mobsandgeeks.saripaar.tests;

import android.widget.TextView;

import android.support.test.espresso.Espresso;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static junit.framework.Assert.assertEquals;

public class TestHelper {

    public static void type(final int viewId, final String text) {
        onView(withId(viewId)).perform(typeText(text));
    }

    public static void clickView(final int viewId) {
        if (viewId == R.id.saripaarButton) {
            Espresso.closeSoftKeyboard();
        }
        onView(withId(viewId)).perform(click());
    }

    public static void checkForText(final String expectedText, final TextView resultTextView) {
        String actualText = resultTextView.getText().toString().trim();
        assertEquals(expectedText, actualText);
    }
}
