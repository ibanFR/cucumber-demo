# Requirements Hierarchies for Cucumber Features

Cucumber expects your feature files to be stored in the *src/test/resources/features* directory.
Your requirements hierarchy goes directly underneath this directory.

Cucumber by default organises requirements hierarchy as follows:
theme > capability > feature

When Cucumber is used with the default configuration, the feature files always represent Features,
and the directories containing the features represent Capabilities.

A Theme is just another way to group related capabilities.

Depending on the size of your project, you may want to use a different hierarchy. For example:

domain > subdomain > capability > feature

The term "Domain" defines a company's overall business area.

The term "Subdomain" refers to a distinct, specialized area within a larger business domain.
The concept of subdomains helps in organizing and managing complexity by breaking down a large business domain into
smaller, more manageable parts.

The aim of any software project is to help our stakeholders achieve their goals by providing them with Capabilities.

A Feature is a concrete solution or implementation that delivers a Capability.
A Feature is typically bigger than a user story, and contains the acceptance criteria (scenarios) from several
user stories.

See [Common Requirements Structures](https://serenity-bdd.github.io/docs/reporting/living_documentation#common-requirements-structures) for more details.

