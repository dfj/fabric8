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
package io.fabric8.tooling.archetype;

import java.util.Collection;
import java.util.List;

import io.fabric8.tooling.archetype.catalog.Archetype;

public interface ArchetypeService extends ArchetypeServiceMXBean {

    /**
     * Returns list of available {@link io.fabric8.tooling.archetype.catalog.Archetype}s
     */
    public Collection<Archetype> listArchetypes();

    /**
     * Returns list of available {@link io.fabric8.tooling.archetype.catalog.Archetype}s
     *
     * @param filter filter text to use in filter
     * @param artifactIdOnly whether to filter using the artifactId only
     */
    public List<Archetype> listArchetypes(String filter, boolean artifactIdOnly);

    /**
     * Returns {@link io.fabric8.tooling.archetype.catalog.Archetype} by it's <code>groupId:artifactId:version</code>
     */
    public Archetype getArchetype(String gav);

    /**
     * Returns {@link io.fabric8.tooling.archetype.catalog.Archetype} by it's <code>artifactId</code>
     */
    public Archetype getArchetypeByArtifact(String artifactId);

}
