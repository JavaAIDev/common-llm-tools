
package com.javaaidev.easyllmtools.tools.writelocalfile.model;


public class WriteLocalFileReturnType {

    /**
     * Path of the file when succeeded
     * 
     */
    private String path;
    /**
     * Error message when this file cannot be written
     * 
     */
    private String error;

    /**
     * No args constructor for use in serialization
     * 
     */
    public WriteLocalFileReturnType() {
    }

    /**
     * 
     * @param path
     *     Path of the file when succeeded.
     * @param error
     *     Error message when this file cannot be written.
     */
    public WriteLocalFileReturnType(String path, String error) {
        super();
        this.path = path;
        this.error = error;
    }

    public static WriteLocalFileReturnType.WriteLocalFileReturnTypeBuilderBase builder() {
        return new WriteLocalFileReturnType.WriteLocalFileReturnTypeBuilder();
    }

    /**
     * Path of the file when succeeded
     * 
     */
    public String getPath() {
        return path;
    }

    /**
     * Path of the file when succeeded
     * 
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * Error message when this file cannot be written
     * 
     */
    public String getError() {
        return error;
    }

    /**
     * Error message when this file cannot be written
     * 
     */
    public void setError(String error) {
        this.error = error;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(WriteLocalFileReturnType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("path");
        sb.append('=');
        sb.append(((this.path == null)?"<null>":this.path));
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
        result = ((result* 31)+((this.path == null)? 0 :this.path.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WriteLocalFileReturnType) == false) {
            return false;
        }
        WriteLocalFileReturnType rhs = ((WriteLocalFileReturnType) other);
        return (((this.error == rhs.error)||((this.error!= null)&&this.error.equals(rhs.error)))&&((this.path == rhs.path)||((this.path!= null)&&this.path.equals(rhs.path))));
    }

    public static class WriteLocalFileReturnTypeBuilder
        extends WriteLocalFileReturnType.WriteLocalFileReturnTypeBuilderBase<WriteLocalFileReturnType>
    {


        public WriteLocalFileReturnTypeBuilder() {
            super();
        }

        public WriteLocalFileReturnTypeBuilder(String path, String error) {
            super(path, error);
        }

    }

    public static abstract class WriteLocalFileReturnTypeBuilderBase<T extends WriteLocalFileReturnType >{

        protected T instance;

        @SuppressWarnings("unchecked")
        public WriteLocalFileReturnTypeBuilderBase() {
            // Skip initialization when called from subclass
            if (this.getClass().equals(WriteLocalFileReturnType.WriteLocalFileReturnTypeBuilder.class)) {
                this.instance = ((T) new WriteLocalFileReturnType());
            }
        }

        @SuppressWarnings("unchecked")
        public WriteLocalFileReturnTypeBuilderBase(String path, String error) {
            // Skip initialization when called from subclass
            if (this.getClass().equals(WriteLocalFileReturnType.WriteLocalFileReturnTypeBuilder.class)) {
                this.instance = ((T) new WriteLocalFileReturnType(path, error));
            }
        }

        public T build() {
            T result;
            result = this.instance;
            this.instance = null;
            return result;
        }

        public WriteLocalFileReturnType.WriteLocalFileReturnTypeBuilderBase withPath(String path) {
            ((WriteLocalFileReturnType) this.instance).path = path;
            return this;
        }

        public WriteLocalFileReturnType.WriteLocalFileReturnTypeBuilderBase withError(String error) {
            ((WriteLocalFileReturnType) this.instance).error = error;
            return this;
        }

    }

}
