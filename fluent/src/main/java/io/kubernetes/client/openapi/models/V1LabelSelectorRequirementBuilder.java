package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1LabelSelectorRequirementBuilder extends io.kubernetes.client.openapi.models.V1LabelSelectorRequirementFluentImpl<io.kubernetes.client.openapi.models.V1LabelSelectorRequirementBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1LabelSelectorRequirement,io.kubernetes.client.openapi.models.V1LabelSelectorRequirementBuilder> {

    io.kubernetes.client.openapi.models.V1LabelSelectorRequirementFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1LabelSelectorRequirementBuilder() {
        this(true);
    }

    public V1LabelSelectorRequirementBuilder(java.lang.Boolean validationEnabled) {
        this(new V1LabelSelectorRequirement(), validationEnabled);
    }

    public V1LabelSelectorRequirementBuilder(io.kubernetes.client.openapi.models.V1LabelSelectorRequirementFluent<?> fluent) {
        this(fluent, true);
    }

    public V1LabelSelectorRequirementBuilder(io.kubernetes.client.openapi.models.V1LabelSelectorRequirementFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1LabelSelectorRequirement(), validationEnabled);
    }

    public V1LabelSelectorRequirementBuilder(io.kubernetes.client.openapi.models.V1LabelSelectorRequirementFluent<?> fluent,io.kubernetes.client.openapi.models.V1LabelSelectorRequirement instance) {
        this(fluent, instance, true);
    }

    public V1LabelSelectorRequirementBuilder(io.kubernetes.client.openapi.models.V1LabelSelectorRequirementFluent<?> fluent,io.kubernetes.client.openapi.models.V1LabelSelectorRequirement instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withKey(instance.getKey());
        
        fluent.withOperator(instance.getOperator());
        
        fluent.withValues(instance.getValues());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1LabelSelectorRequirementBuilder(io.kubernetes.client.openapi.models.V1LabelSelectorRequirement instance) {
        this(instance,true);
    }

    public V1LabelSelectorRequirementBuilder(io.kubernetes.client.openapi.models.V1LabelSelectorRequirement instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withKey(instance.getKey());
        
        this.withOperator(instance.getOperator());
        
        this.withValues(instance.getValues());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1LabelSelectorRequirement build() {
        V1LabelSelectorRequirement buildable = new V1LabelSelectorRequirement();
        buildable.setKey(fluent.getKey());
        buildable.setOperator(fluent.getOperator());
        buildable.setValues(fluent.getValues());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1LabelSelectorRequirementBuilder that = (V1LabelSelectorRequirementBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
