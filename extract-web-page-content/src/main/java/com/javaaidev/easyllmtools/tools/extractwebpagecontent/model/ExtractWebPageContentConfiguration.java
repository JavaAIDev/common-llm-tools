
package com.javaaidev.easyllmtools.tools.extractwebpagecontent.model;


public class ExtractWebPageContentConfiguration {

    /**
     * Size limit of returned content
     * 
     */
    private Integer sizeLimit = 1000;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ExtractWebPageContentConfiguration() {
    }

    /**
     * 
     * @param sizeLimit
     *     Size limit of returned content.
     */
    public ExtractWebPageContentConfiguration(Integer sizeLimit) {
        super();
        this.sizeLimit = sizeLimit;
    }

    public static ExtractWebPageContentConfiguration.ExtractWebPageContentConfigurationBuilderBase builder() {
        return new ExtractWebPageContentConfiguration.ExtractWebPageContentConfigurationBuilder();
    }

    /**
     * Size limit of returned content
     * 
     */
    public Integer getSizeLimit() {
        return sizeLimit;
    }

    /**
     * Size limit of returned content
     * 
     */
    public void setSizeLimit(Integer sizeLimit) {
        this.sizeLimit = sizeLimit;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ExtractWebPageContentConfiguration.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sizeLimit");
        sb.append('=');
        sb.append(((this.sizeLimit == null)?"<null>":this.sizeLimit));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.sizeLimit == null)? 0 :this.sizeLimit.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ExtractWebPageContentConfiguration) == false) {
            return false;
        }
        ExtractWebPageContentConfiguration rhs = ((ExtractWebPageContentConfiguration) other);
        return ((this.sizeLimit == rhs.sizeLimit)||((this.sizeLimit!= null)&&this.sizeLimit.equals(rhs.sizeLimit)));
    }

    public static class ExtractWebPageContentConfigurationBuilder
        extends ExtractWebPageContentConfiguration.ExtractWebPageContentConfigurationBuilderBase<ExtractWebPageContentConfiguration>
    {


        public ExtractWebPageContentConfigurationBuilder() {
            super();
        }

        public ExtractWebPageContentConfigurationBuilder(Integer sizeLimit) {
            super(sizeLimit);
        }

    }

    public static abstract class ExtractWebPageContentConfigurationBuilderBase<T extends ExtractWebPageContentConfiguration >{

        protected T instance;

        @SuppressWarnings("unchecked")
        public ExtractWebPageContentConfigurationBuilderBase() {
            // Skip initialization when called from subclass
            if (this.getClass().equals(ExtractWebPageContentConfiguration.ExtractWebPageContentConfigurationBuilder.class)) {
                this.instance = ((T) new ExtractWebPageContentConfiguration());
            }
        }

        @SuppressWarnings("unchecked")
        public ExtractWebPageContentConfigurationBuilderBase(Integer sizeLimit) {
            // Skip initialization when called from subclass
            if (this.getClass().equals(ExtractWebPageContentConfiguration.ExtractWebPageContentConfigurationBuilder.class)) {
                this.instance = ((T) new ExtractWebPageContentConfiguration(sizeLimit));
            }
        }

        public T build() {
            T result;
            result = this.instance;
            this.instance = null;
            return result;
        }

        public ExtractWebPageContentConfiguration.ExtractWebPageContentConfigurationBuilderBase withSizeLimit(Integer sizeLimit) {
            ((ExtractWebPageContentConfiguration) this.instance).sizeLimit = sizeLimit;
            return this;
        }

    }

}
