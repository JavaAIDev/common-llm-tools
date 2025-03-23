
package com.javaaidev.easyllmtools.tools.readlocalfile.model;


public class ReadLocalFileConfiguration {

    /**
     * Base directory of the file
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
    public ReadLocalFileConfiguration() {
    }

    /**
     * 
     * @param charset
     *     Charset to read this file.
     * @param basePath
     *     Base directory of the file.
     */
    public ReadLocalFileConfiguration(String basePath, String charset) {
        super();
        this.basePath = basePath;
        this.charset = charset;
    }

    public static ReadLocalFileConfiguration.ReadLocalFileConfigurationBuilderBase builder() {
        return new ReadLocalFileConfiguration.ReadLocalFileConfigurationBuilder();
    }

    /**
     * Base directory of the file
     * 
     */
    public String getBasePath() {
        return basePath;
    }

    /**
     * Base directory of the file
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
        sb.append(ReadLocalFileConfiguration.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof ReadLocalFileConfiguration) == false) {
            return false;
        }
        ReadLocalFileConfiguration rhs = ((ReadLocalFileConfiguration) other);
        return (((this.basePath == rhs.basePath)||((this.basePath!= null)&&this.basePath.equals(rhs.basePath)))&&((this.charset == rhs.charset)||((this.charset!= null)&&this.charset.equals(rhs.charset))));
    }

    public static class ReadLocalFileConfigurationBuilder
        extends ReadLocalFileConfiguration.ReadLocalFileConfigurationBuilderBase<ReadLocalFileConfiguration>
    {


        public ReadLocalFileConfigurationBuilder() {
            super();
        }

        public ReadLocalFileConfigurationBuilder(String basePath, String charset) {
            super(basePath, charset);
        }

    }

    public static abstract class ReadLocalFileConfigurationBuilderBase<T extends ReadLocalFileConfiguration >{

        protected T instance;

        @SuppressWarnings("unchecked")
        public ReadLocalFileConfigurationBuilderBase() {
            // Skip initialization when called from subclass
            if (this.getClass().equals(ReadLocalFileConfiguration.ReadLocalFileConfigurationBuilder.class)) {
                this.instance = ((T) new ReadLocalFileConfiguration());
            }
        }

        @SuppressWarnings("unchecked")
        public ReadLocalFileConfigurationBuilderBase(String basePath, String charset) {
            // Skip initialization when called from subclass
            if (this.getClass().equals(ReadLocalFileConfiguration.ReadLocalFileConfigurationBuilder.class)) {
                this.instance = ((T) new ReadLocalFileConfiguration(basePath, charset));
            }
        }

        public T build() {
            T result;
            result = this.instance;
            this.instance = null;
            return result;
        }

        public ReadLocalFileConfiguration.ReadLocalFileConfigurationBuilderBase withBasePath(String basePath) {
            ((ReadLocalFileConfiguration) this.instance).basePath = basePath;
            return this;
        }

        public ReadLocalFileConfiguration.ReadLocalFileConfigurationBuilderBase withCharset(String charset) {
            ((ReadLocalFileConfiguration) this.instance).charset = charset;
            return this;
        }

    }

}
