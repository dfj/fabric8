/**
 *  Copyright 2005-2014 Red Hat, Inc.
 *
 *  Red Hat licenses this file to you under the Apache License, version
 *  2.0 (the "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 *  implied.  See the License for the specific language governing
 *  permissions and limitations under the License.
 */
package io.fabric8.api.mxbean;

import io.fabric8.api.Constants;

import java.util.List;
import java.util.Map;

import javax.management.MXBean;
import javax.management.ObjectName;

import org.jboss.gravia.utils.ObjectNameFactory;

@MXBean
public interface ProfileManagement {

    ObjectName OBJECT_NAME = ObjectNameFactory.create(Constants.MANAGEMENT_DOMAIN + ":type=" + ProfileManagement.class.getSimpleName());

    VersionState createVersion(VersionState version);
    
    VersionState createVersion(String sourceId, String targetId, Map<String, String> attributes);
    
    List<String> getVersions();
    
    VersionState getVersion(String versionId);
    
    void deleteVersion(String versionId);
    
    ProfileState createProfile(ProfileState profile);
    
    ProfileState getProfile(String versionId, String profileId);
    
    ProfileState updateProfile(ProfileState profile);
    
    void deleteProfile(String versionId, String profileId, boolean force);
}
