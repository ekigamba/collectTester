/*
 * Copyright 2017 Nafundi
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.odk.collectTester.utilities;

public class Constants {
    public static final String LIST_MODE_KEY = "listModeKey";

    public static final String FORMS = "forms";
    public static final String INSTANCES = "instances";

    public static final String FORM_MODE = "formMode";
    public static final String VIEW_SENT = "viewSent";

    public static final String FORMS_CHOOSER_INTENT_TYPE = "vnd.android.cursor.dir/vnd.odk.form";
    public static final String INSTANCES_CHOOSER_INTENT_TYPE = "vnd.android.cursor.dir/vnd.odk.instance";
    public static final String SENT_FORMS_INTENT_TYPE = "vnd.android.cursor.dir/vnd.odk.instance";

    public static final String FORMS_URI = "content://org.odk.collect.android.provider.odk.forms/forms";
    public static final String INSTANCES_URI = "content://org.odk.collect.android.provider.odk.instances/instances";

    public static final String DISPLAY_NAME = "displayName";
    public static final String DISPLAY_SUBTEXT = "displaySubtext";
  
    public static final String STATUS = "status";
    public static final String STATUS_SUBMITTED = "submitted";

    public static final String COLLECT_PACKAGE_NAME = "org.odk.collect.android";

    public static final String FILL_BLANK_FORM_CODE = "file:///android_asset/fill_blank_form_code.html";
    public static final String EDIT_SAVED_FORM_CODE = "file:///android_asset/edit_saved_form_code.html";
    public static final String SEND_FINALIZED_FORM_CODE = "file:///android_asset/send_finalize_form_code.html";
    public static final String VIEW_SENT_FORM_CODE = "file:///android_asset/view_sent_form_code.html";
}
