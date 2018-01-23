#
# Copyright (C) 2017 The Android Open Source Project
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#      http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#

LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)

LOCAL_SRC_FILES := \
    $(call all-java-files-under, common) \
    $(call all-java-files-under, src)

LOCAL_MODULE_TAGS := tests

# tag this module as a cts test artifact
LOCAL_COMPATIBILITY_SUITE := cts

LOCAL_MODULE := CtsMediaHostTestCases

LOCAL_JAVA_LIBRARIES := cts-tradefed tradefed compatibility-host-util

include $(BUILD_CTS_HOST_JAVA_LIBRARY)

include $(call first-makefiles-under,$(LOCAL_PATH))

