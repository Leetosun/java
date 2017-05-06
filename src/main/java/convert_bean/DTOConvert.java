package convert_bean;

/**
 * Created by LeeToSun on 2017/5/6
 */
public interface DTOConvert<S, T> {
    T convert(S s);
}
