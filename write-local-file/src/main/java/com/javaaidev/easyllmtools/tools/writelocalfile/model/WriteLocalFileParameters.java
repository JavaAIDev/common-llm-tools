
package com.javaaidev.easyllmtools.tools.writelocalfile.model;


public class WriteLocalFileParameters {

    /**
     * Name of the file to write
     * 
     */
    private String filename;
    /**
     * Content of the file
     * (Required)
     * 
     */
    private String content;
    /**
     * Should the content be appended to the file
     * 
     */
    private Boolean append;

    /**
     * No args constructor for use in serialization
     * 
     */
    public WriteLocalFileParameters() {
    }

    /**
     * 
     * @param filename
     *     Name of the file to write.
     * @param content
     *     Content of the file.
     * @param append
     *     Should the content be appended to the file.
     */
    public WriteLocalFileParameters(String filename, String content, Boolean append) {
        super();
        this.filename = filename;
        this.content = content;
        this.append = append;
    }

    /**
     * 
     * @param content
     *     Content of the file.
     */
    public WriteLocalFileParameters(String content) {
        super();
        this.content = content;
    }

    public static WriteLocalFileParameters.WriteLocalFileParametersBuilderBase builder() {
        return new WriteLocalFileParameters.WriteLocalFileParametersBuilder();
    }

    /**
     * Name of the file to write
     * 
     */
    public String getFilename() {
        return filename;
    }

    /**
     * Name of the file to write
     * 
     */
    public void setFilename(String filename) {
        this.filename = filename;
    }

    /**
     * Content of the file
     * (Required)
     * 
     */
    public String getContent() {
        return content;
    }

    /**
     * Content of the file
     * (Required)
     * 
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Should the content be appended to the file
     * 
     */
    public Boolean getAppend() {
        return append;
    }

    /**
     * Should the content be appended to the file
     * 
     */
    public void setAppend(Boolean append) {
        this.append = append;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(WriteLocalFileParameters.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("filename");
        sb.append('=');
        sb.append(((this.filename == null)?"<null>":this.filename));
        sb.append(',');
        sb.append("content");
        sb.append('=');
        sb.append(((this.content == null)?"<null>":this.content));
        sb.append(',');
        sb.append("append");
        sb.append('=');
        sb.append(((this.append == null)?"<null>":this.append));
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
        result = ((result* 31)+((this.content == null)? 0 :this.content.hashCode()));
        result = ((result* 31)+((this.append == null)? 0 :this.append.hashCode()));
        result = ((result* 31)+((this.filename == null)? 0 :this.filename.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WriteLocalFileParameters) == false) {
            return false;
        }
        WriteLocalFileParameters rhs = ((WriteLocalFileParameters) other);
        return ((((this.content == rhs.content)||((this.content!= null)&&this.content.equals(rhs.content)))&&((this.append == rhs.append)||((this.append!= null)&&this.append.equals(rhs.append))))&&((this.filename == rhs.filename)||((this.filename!= null)&&this.filename.equals(rhs.filename))));
    }

    public static class WriteLocalFileParametersBuilder
        extends WriteLocalFileParameters.WriteLocalFileParametersBuilderBase<WriteLocalFileParameters>
    {


        public WriteLocalFileParametersBuilder() {
            super();
        }

        public WriteLocalFileParametersBuilder(String filename, String content, Boolean append) {
            super(filename, content, append);
        }

        public WriteLocalFileParametersBuilder(String content) {
            super(content);
        }

    }

    public static abstract class WriteLocalFileParametersBuilderBase<T extends WriteLocalFileParameters >{

        protected T instance;

        @SuppressWarnings("unchecked")
        public WriteLocalFileParametersBuilderBase() {
            // Skip initialization when called from subclass
            if (this.getClass().equals(WriteLocalFileParameters.WriteLocalFileParametersBuilder.class)) {
                this.instance = ((T) new WriteLocalFileParameters());
            }
        }

        @SuppressWarnings("unchecked")
        public WriteLocalFileParametersBuilderBase(String filename, String content, Boolean append) {
            // Skip initialization when called from subclass
            if (this.getClass().equals(WriteLocalFileParameters.WriteLocalFileParametersBuilder.class)) {
                this.instance = ((T) new WriteLocalFileParameters(filename, content, append));
            }
        }

        @SuppressWarnings("unchecked")
        public WriteLocalFileParametersBuilderBase(String content) {
            // Skip initialization when called from subclass
            if (this.getClass().equals(WriteLocalFileParameters.WriteLocalFileParametersBuilder.class)) {
                this.instance = ((T) new WriteLocalFileParameters(content));
            }
        }

        public T build() {
            T result;
            result = this.instance;
            this.instance = null;
            return result;
        }

        public WriteLocalFileParameters.WriteLocalFileParametersBuilderBase withFilename(String filename) {
            ((WriteLocalFileParameters) this.instance).filename = filename;
            return this;
        }

        public WriteLocalFileParameters.WriteLocalFileParametersBuilderBase withContent(String content) {
            ((WriteLocalFileParameters) this.instance).content = content;
            return this;
        }

        public WriteLocalFileParameters.WriteLocalFileParametersBuilderBase withAppend(Boolean append) {
            ((WriteLocalFileParameters) this.instance).append = append;
            return this;
        }

    }

}
