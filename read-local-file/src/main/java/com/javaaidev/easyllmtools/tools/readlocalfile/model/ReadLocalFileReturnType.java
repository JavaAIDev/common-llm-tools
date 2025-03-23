
package com.javaaidev.easyllmtools.tools.readlocalfile.model;


public class ReadLocalFileReturnType {

    /**
     * Content of this file
     * 
     */
    private String content;
    /**
     * Error message when this file cannot be read
     * 
     */
    private String error;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ReadLocalFileReturnType() {
    }

    /**
     * 
     * @param error
     *     Error message when this file cannot be read.
     * @param content
     *     Content of this file.
     */
    public ReadLocalFileReturnType(String content, String error) {
        super();
        this.content = content;
        this.error = error;
    }

    public static ReadLocalFileReturnType.ReadLocalFileReturnTypeBuilderBase builder() {
        return new ReadLocalFileReturnType.ReadLocalFileReturnTypeBuilder();
    }

    /**
     * Content of this file
     * 
     */
    public String getContent() {
        return content;
    }

    /**
     * Content of this file
     * 
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Error message when this file cannot be read
     * 
     */
    public String getError() {
        return error;
    }

    /**
     * Error message when this file cannot be read
     * 
     */
    public void setError(String error) {
        this.error = error;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ReadLocalFileReturnType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof ReadLocalFileReturnType) == false) {
            return false;
        }
        ReadLocalFileReturnType rhs = ((ReadLocalFileReturnType) other);
        return (((this.error == rhs.error)||((this.error!= null)&&this.error.equals(rhs.error)))&&((this.content == rhs.content)||((this.content!= null)&&this.content.equals(rhs.content))));
    }

    public static class ReadLocalFileReturnTypeBuilder
        extends ReadLocalFileReturnType.ReadLocalFileReturnTypeBuilderBase<ReadLocalFileReturnType>
    {


        public ReadLocalFileReturnTypeBuilder() {
            super();
        }

        public ReadLocalFileReturnTypeBuilder(String content, String error) {
            super(content, error);
        }

    }

    public static abstract class ReadLocalFileReturnTypeBuilderBase<T extends ReadLocalFileReturnType >{

        protected T instance;

        @SuppressWarnings("unchecked")
        public ReadLocalFileReturnTypeBuilderBase() {
            // Skip initialization when called from subclass
            if (this.getClass().equals(ReadLocalFileReturnType.ReadLocalFileReturnTypeBuilder.class)) {
                this.instance = ((T) new ReadLocalFileReturnType());
            }
        }

        @SuppressWarnings("unchecked")
        public ReadLocalFileReturnTypeBuilderBase(String content, String error) {
            // Skip initialization when called from subclass
            if (this.getClass().equals(ReadLocalFileReturnType.ReadLocalFileReturnTypeBuilder.class)) {
                this.instance = ((T) new ReadLocalFileReturnType(content, error));
            }
        }

        public T build() {
            T result;
            result = this.instance;
            this.instance = null;
            return result;
        }

        public ReadLocalFileReturnType.ReadLocalFileReturnTypeBuilderBase withContent(String content) {
            ((ReadLocalFileReturnType) this.instance).content = content;
            return this;
        }

        public ReadLocalFileReturnType.ReadLocalFileReturnTypeBuilderBase withError(String error) {
            ((ReadLocalFileReturnType) this.instance).error = error;
            return this;
        }

    }

}
