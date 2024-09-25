# Requirements Hierarchies for Cucumber Features

Cucumber expects your feature files to be stored in the \*src/test/resources/features\* directory.

Feature files are typically organized in a hierarchy of folders underneath this directory, conforming the Requirements
hierarchy of the project.

## Default Requirements Hierarchy

By default, Cucumber organizes the requirements hierarchy as follows:

**Theme** > **Capability** > **Feature**

- **Theme**: A way to group related capabilities.
- **Capability**: Represents a high-level functionality or business goal.
- **Feature**: Represents a specific functionality or behavior.

## Custom Requirements Hierarchy

Depending on the size of your project, you may want to use a different hierarchy. For example:

**Domain** > **Subdomain** > **Capability** > **Feature**

- **Domain**: Defines a company's overall business area.
- **Subdomain**: Refers to a distinct, specialized area within a larger business domain. It helps in organizing and managing complexity by breaking down a large business domain into smaller, more manageable parts.
- **Capability**: Helps stakeholders achieve their goals by providing them with specific functionalities.
- **Feature**: A concrete solution or implementation that delivers a capability. It is typically bigger than a user story and contains the acceptance criteria (scenarios) from several user stories.

This can be achieved by updating the Serenity configuration file: `serenity.properties`

```properties   
serenity.requirement.types=domain,subdomain,capability,feature
```

For more details, see [Common Requirements Structures](https://serenity-bdd.github.io/docs/reporting/living_documentation#common-requirements-structures).