package com.tugcankoparan.example;
import javax.annotation.Generated;
import com.querydsl.core.types.PathMetadataFactory;
import com.querydsl.core.types.dsl.EntityPathBase;
import com.querydsl.core.types.dsl.NumberPath;
import com.querydsl.core.types.dsl.StringPath;

@Generated("com.querydsl.codegen.EntitySerializer")
public class QEmployee extends EntityPathBase<Employee> {

    private static final long serialVersionUID = 1792630833L;

    public static final QEmployee employee = new QEmployee("employee");

    public final StringPath dept = createString("dept");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> salary = createNumber("salary", Integer.class);

    public QEmployee(String variable) {
        super(Employee.class, PathMetadataFactory.forVariable(variable));
    }
}
