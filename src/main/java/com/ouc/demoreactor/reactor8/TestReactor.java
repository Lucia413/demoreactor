package com.ouc.demoreactor.reactor8;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * ClassName:TestReactor
 * Package:com.ouc.demoreactor.reactor8
 * Description:
 *
 * @author yangshouheng
 * @create 2022-01-10 17:14
 */
public class TestReactor {
    public static void main(String[] args) {
        //just 方法直接声明
        Flux.just(1,2,3,4).subscribe(System.out::print);
        Mono.just(1).subscribe(System.out::print);
        //其他的方法
        Integer[] array = {1,2,3,4};
        Flux.fromArray(array);
        List<Integer> list = Arrays.asList(array);
        Flux.fromIterable(list);
        Stream<Integer> stream = list.stream();
        Flux.fromStream(stream);
        System.out.println("HAHH");
        System.out.println("hhh");
        System.out.println("hot-fix");
    }
}
