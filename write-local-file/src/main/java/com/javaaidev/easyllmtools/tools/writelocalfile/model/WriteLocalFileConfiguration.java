
package com.javaaidev.easyllmtools.tools.writelocalfile.model;


public class WriteLocalFileConfiguration {

    /**
     * Base directory to write files
     * 
     */
    private String basePath;
    /**
     * Charset to read this file
     * 
     */
    private String charset = "UTF-8";

    /**
     * No args constructor for use in serialization
     * 
     */
    public WriteLocalFileConfiguration() {
    }

    /**
     * 
     * @param charset
     *     Charset to read this file.
     * @param basePath
     *     Base directory to write files.
     */
    public WriteLocalFileConfiguration(String basePath, String charset) {
        super();
        this.basePath = basePath;
        this.charset = charset;
    }

    public static WriteLocalFileConfiguration.WriteLocalFileConfigurationBuilderBase builder() {
        return new WriteLocalFileConfiguration.WriteLocalFileConfigurationBuilder();
    }

    /**
     * Base directory to write files
     * 
     */
    public String getBasePath() {
        return basePath;
    }

    /**
     * Base directory to write files
     * 
     */
    public void setBasePath(String basePath) {
        this.basePath = basePath;
    }

    /**
     * Charset to read this file
     * 
     */
    public String getCharset() {
        return charset;
    }

    /**
     * Charset to read this file
     * 
     */
    public void setCharset(String charset) {
        this.charset = charset;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(WriteLocalFileConfiguration.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("basePath");
        sb.append('=');
        sb.append(((this.basePath == null)?"<null>":this.basePath));
        sb.append(',');
        sb.append("charset");
        sb.append('=');
        sb.append(((this.charset == null)?"<null>":this.charset));
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
        result = ((result* 31)+((this.basePath == null)? 0 :this.basePath.hashCode()));
        result = ((result* 31)+((this.charset == null)? 0 :this.charset.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WriteLocalFileConfiguration) == false) {
            return false;
        }
        WriteLocalFileConfiguration rhs = ((WriteLocalFileConfiguration) other);
        return (((this.basePath == rhs.basePath)||((this.basePath!= null)&&this.basePath.equals(rhs.basePath)))&&((this.charset == rhs.charset)||((this.charset!= null)&&this.charset.equals(rhs.charset))));
    }

    public static class WriteLocalFileConfigurationBuilder
        extends WriteLocalFileConfiguration.WriteLocalFileConfigurationBuilderBase<WriteLocalFileConfiguration>
    {


        public WriteLocalFileConfigurationBuilder() {
            super();
        }

        public WriteLocalFileConfigurationBuilder(String basePath, String charset) {
            super(basePath, charset);
        }

    }

    public static abstract class WriteLocalFileConfigurationBuilderBase<T extends WriteLocalFileConfiguration >{

        protected T instance;

        @SuppressWarnings("unchecked")
        public WriteLocalFileConfigurationBuilderBase() {
            // Skip initialization when called from subclass
            if (this.getClass().equals(WriteLocalFileConfiguration.WriteLocalFileConfigurationBuilder.class)) {
                this.instance = ((T) new WriteLocalFileConfiguration());
            }
        }

        @SuppressWarnings("unchecked")
        public WriteLocalFileConfigurationBuilderBase(String basePath, String charset) {
            // Skip initialization when called from subclass
            if (this.getClass().equals(WriteLocalFileConfiguration.WriteLocalFileConfigurationBuilder.class)) {
                this.instance = ((T) new WriteLocalFileConfiguration(basePath, charset));
            }
        }

        public T build() {
            T result;
            result = this.instance;
            this.instance = null;
            return result;
        }

        public WriteLocalFileConfiguration.WriteLocalFileConfigurationBuilderBase withBasePath(String basePath) {
            ((WriteLocalFileConfiguration) this.instance).basePath = basePath;
            return this;
        }

        public WriteLocalFileConfiguration.WriteLocalFileConfigurationBuilderBase withCharset(String charset) {
            ((WriteLocalFileConfiguration) this.instance).charset = charset;
            return this;
        }

    }

}
