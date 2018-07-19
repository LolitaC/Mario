package common;

/**
 * 资源解析类接口
 */
public interface IResource<T> {
    T[] getResource(String key);
}
