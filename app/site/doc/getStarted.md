## Get Started

### Installation

First you need to download a <a class="btn" href="https://repository.jboss.org/nexus/content/groups/ea/io/fabric8/fabric8-karaf/">fabric8 distribution</a>

Then unpack the tarball:

    cd ~/Downloads
    tar zxf fabric8-karaf-1.0.0.redhat-370.tar.gz
    cd fabric8-karaf-1.0.0.redhat-370

Or you could build the project with [maven](http://maven.apache.org/) via:

    mvn -DskipTests clean install -Pall
    cd fabric/fabric8-karaf/target
    tar xf fabric8-karaf-1.1.0-SNAPSHOT.tar.gz
    cd fabric8-karaf-1.1.0-SNAPSHOT

### Create a fabric

From the distro, start up the container via:

    export FABRIC8_ZOOKEEPER_PASSWORD=mypassword
    bin/fabric8

Once the container has started up, you have a working Fabric and you can connect to the console

### Use the console

Then open the [hawtio based](http://hawt.io/) console via the link: <a class="btn" href="http://localhost:8181/">localhost:8181</a>

Then check out the documentation in the [embedded fabric8 wiki](http://localhost:8181/hawtio/index.html#/wiki/branch/1.0/view/fabric/profiles) to guide you through all the available [profiles](#/site/book/doc/index.md?chapter=profiles_md) you can create in a new container or add to an existing container.

Or check out:

 * [how to use the command shell](#/site/book/doc/index.md?chapter=agent_md)
 * [how to use git with fabric8](#/site/book/doc/index.md?chapter=git_md)

### View a demo

To help you get started you could watch one of the demos in the  <a class="btn" href="https://vimeo.com/album/2635012">JBoss Fuse and JBoss A-MQ demo album</a>

For example try this: <a class="btn" href="https://vimeo.com/80625940">JBoss Fuse 6.1 Demo</a>