Seam Booking on OpenShift
=========================

This is the classic Seam Booking example ported to Java EE 6 infused with Seam
3 portable extensions, all running on OpenShift.  It's also been given a fresh 
new look. See features.txt for a list of features that are demonstrated by this 
example.

Running on OpenShift
--------------------

Create an account at http://openshift.redhat.com/

Create a jbossas-7.0 application

    rhc-create-app -a seambooking -t jbossas-7.0

Add this upstream seambooking repo

    cd seambooking
    git remote add upstream -m master git://github.com/openshift/seambooking-example.git
    git pull -s recursive -X theirs upstream master

Then push the repo upstream

    git push

That's it, you can now checkout your application at:

    http://seambooking-$yournamespace.rhcloud.com
