
package com.javaaidev.easyllmtools.tools.readlocalfile.model;


public class ReadLocalFileParameters {

    /**
     * Path of the file to read
     * 
     */
    private String filePath;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ReadLocalFileParameters() {
    }

    /**
     * 
     * @param filePath
     *     Path of the file to read.
     */
    public ReadLocalFileParameters(String filePath) {
        super();
        this.filePath = filePath;
    }

    public static ReadLocalFileParameters.ReadLocalFileParametersBuilderBase builder() {
        return new ReadLocalFileParameters.ReadLocalFileParametersBuilder();
    }

    /**
     * Path of the file to read
     * 
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * Path of the file to read
     * 
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ReadLocalFileParameters.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("filePath");
        sb.append('=');
        sb.append(((this.filePath == null)?"<null>":this.filePath));
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
        result = ((result* 31)+((this.filePath == null)? 0 :this.filePath.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ReadLocalFileParameters) == false) {
            return false;
        }
        ReadLocalFileParameters rhs = ((ReadLocalFileParameters) other);
        return ((this.filePath == rhs.filePath)||((this.filePath!= null)&&this.filePath.equals(rhs.filePath)));
    }

    public static class ReadLocalFileParametersBuilder
        extends ReadLocalFileParameters.ReadLocalFileParametersBuilderBase<ReadLocalFileParameters>
    {


        public ReadLocalFileParametersBuilder() {
            super();
        }

        public ReadLocalFileParametersBuilder(String filePath) {
            super(filePath);
        }

    }

    public static abstract class ReadLocalFileParametersBuilderBase<T extends ReadLocalFileParameters >{

        protected T instance;

        @SuppressWarnings("unchecked")
        public ReadLocalFileParametersBuilderBase() {
            // Skip initialization when called from subclass
            if (this.getClass().equals(ReadLocalFileParameters.ReadLocalFileParametersBuilder.class)) {
                this.instance = ((T) new ReadLocalFileParameters());
            }
        }

        @SuppressWarnings("unchecked")
        public ReadLocalFileParametersBuilderBase(String filePath) {
            // Skip initialization when called from subclass
            if (this.getClass().equals(ReadLocalFileParameters.ReadLocalFileParametersBuilder.class)) {
                this.instance = ((T) new ReadLocalFileParameters(filePath));
            }
        }

        public T build() {
            T result;
            result = this.instance;
            this.instance = null;
            return result;
        }

        public ReadLocalFileParameters.ReadLocalFileParametersBuilderBase withFilePath(String filePath) {
            ((ReadLocalFileParameters) this.instance).filePath = filePath;
            return this;
        }

    }

}
