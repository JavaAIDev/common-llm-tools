
package com.javaaidev.easyllmtools.tools.extractwebpagecontent.model;


public class ExtractWebPageContentParameters {

    /**
     * Url of the web page to extract content
     * 
     */
    private String url;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ExtractWebPageContentParameters() {
    }

    /**
     * 
     * @param url
     *     Url of the web page to extract content.
     */
    public ExtractWebPageContentParameters(String url) {
        super();
        this.url = url;
    }

    public static ExtractWebPageContentParameters.ExtractWebPageContentParametersBuilderBase builder() {
        return new ExtractWebPageContentParameters.ExtractWebPageContentParametersBuilder();
    }

    /**
     * Url of the web page to extract content
     * 
     */
    public String getUrl() {
        return url;
    }

    /**
     * Url of the web page to extract content
     * 
     */
    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ExtractWebPageContentParameters.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
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
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ExtractWebPageContentParameters) == false) {
            return false;
        }
        ExtractWebPageContentParameters rhs = ((ExtractWebPageContentParameters) other);
        return ((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url)));
    }

    public static class ExtractWebPageContentParametersBuilder
        extends ExtractWebPageContentParameters.ExtractWebPageContentParametersBuilderBase<ExtractWebPageContentParameters>
    {


        public ExtractWebPageContentParametersBuilder() {
            super();
        }

        public ExtractWebPageContentParametersBuilder(String url) {
            super(url);
        }

    }

    public static abstract class ExtractWebPageContentParametersBuilderBase<T extends ExtractWebPageContentParameters >{

        protected T instance;

        @SuppressWarnings("unchecked")
        public ExtractWebPageContentParametersBuilderBase() {
            // Skip initialization when called from subclass
            if (this.getClass().equals(ExtractWebPageContentParameters.ExtractWebPageContentParametersBuilder.class)) {
                this.instance = ((T) new ExtractWebPageContentParameters());
            }
        }

        @SuppressWarnings("unchecked")
        public ExtractWebPageContentParametersBuilderBase(String url) {
            // Skip initialization when called from subclass
            if (this.getClass().equals(ExtractWebPageContentParameters.ExtractWebPageContentParametersBuilder.class)) {
                this.instance = ((T) new ExtractWebPageContentParameters(url));
            }
        }

        public T build() {
            T result;
            result = this.instance;
            this.instance = null;
            return result;
        }

        public ExtractWebPageContentParameters.ExtractWebPageContentParametersBuilderBase withUrl(String url) {
            ((ExtractWebPageContentParameters) this.instance).url = url;
            return this;
        }

    }

}
