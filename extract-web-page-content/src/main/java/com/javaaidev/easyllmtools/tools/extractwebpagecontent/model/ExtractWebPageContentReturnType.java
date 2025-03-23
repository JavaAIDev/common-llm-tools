
package com.javaaidev.easyllmtools.tools.extractwebpagecontent.model;


public class ExtractWebPageContentReturnType {

    /**
     * Content of the web page
     * 
     */
    private String content;
    /**
     * Error message when this web page cannot be loaded
     * 
     */
    private String error;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ExtractWebPageContentReturnType() {
    }

    /**
     * 
     * @param error
     *     Error message when this web page cannot be loaded.
     * @param content
     *     Content of the web page.
     */
    public ExtractWebPageContentReturnType(String content, String error) {
        super();
        this.content = content;
        this.error = error;
    }

    public static ExtractWebPageContentReturnType.ExtractWebPageContentReturnTypeBuilderBase builder() {
        return new ExtractWebPageContentReturnType.ExtractWebPageContentReturnTypeBuilder();
    }

    /**
     * Content of the web page
     * 
     */
    public String getContent() {
        return content;
    }

    /**
     * Content of the web page
     * 
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Error message when this web page cannot be loaded
     * 
     */
    public String getError() {
        return error;
    }

    /**
     * Error message when this web page cannot be loaded
     * 
     */
    public void setError(String error) {
        this.error = error;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ExtractWebPageContentReturnType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("content");
        sb.append('=');
        sb.append(((this.content == null)?"<null>":this.content));
        sb.append(',');
        sb.append("error");
        sb.append('=');
        sb.append(((this.error == null)?"<null>":this.error));
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
        result = ((result* 31)+((this.error == null)? 0 :this.error.hashCode()));
        result = ((result* 31)+((this.content == null)? 0 :this.content.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ExtractWebPageContentReturnType) == false) {
            return false;
        }
        ExtractWebPageContentReturnType rhs = ((ExtractWebPageContentReturnType) other);
        return (((this.error == rhs.error)||((this.error!= null)&&this.error.equals(rhs.error)))&&((this.content == rhs.content)||((this.content!= null)&&this.content.equals(rhs.content))));
    }

    public static class ExtractWebPageContentReturnTypeBuilder
        extends ExtractWebPageContentReturnType.ExtractWebPageContentReturnTypeBuilderBase<ExtractWebPageContentReturnType>
    {


        public ExtractWebPageContentReturnTypeBuilder() {
            super();
        }

        public ExtractWebPageContentReturnTypeBuilder(String content, String error) {
            super(content, error);
        }

    }

    public static abstract class ExtractWebPageContentReturnTypeBuilderBase<T extends ExtractWebPageContentReturnType >{

        protected T instance;

        @SuppressWarnings("unchecked")
        public ExtractWebPageContentReturnTypeBuilderBase() {
            // Skip initialization when called from subclass
            if (this.getClass().equals(ExtractWebPageContentReturnType.ExtractWebPageContentReturnTypeBuilder.class)) {
                this.instance = ((T) new ExtractWebPageContentReturnType());
            }
        }

        @SuppressWarnings("unchecked")
        public ExtractWebPageContentReturnTypeBuilderBase(String content, String error) {
            // Skip initialization when called from subclass
            if (this.getClass().equals(ExtractWebPageContentReturnType.ExtractWebPageContentReturnTypeBuilder.class)) {
                this.instance = ((T) new ExtractWebPageContentReturnType(content, error));
            }
        }

        public T build() {
            T result;
            result = this.instance;
            this.instance = null;
            return result;
        }

        public ExtractWebPageContentReturnType.ExtractWebPageContentReturnTypeBuilderBase withContent(String content) {
            ((ExtractWebPageContentReturnType) this.instance).content = content;
            return this;
        }

        public ExtractWebPageContentReturnType.ExtractWebPageContentReturnTypeBuilderBase withError(String error) {
            ((ExtractWebPageContentReturnType) this.instance).error = error;
            return this;
        }

    }

}
