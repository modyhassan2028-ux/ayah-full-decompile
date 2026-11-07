package io.realm.kotlin;

import io.realm.Case;
import io.realm.RealmModel;
import io.realm.RealmQuery;
import java.util.Date;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class RealmQueryExtensionsKt {
    public static final <T extends RealmModel> RealmQuery<T> oneOf(RealmQuery<T> realmQuery, String str, String[] strArr, Case r10) {
        j.e(realmQuery, "<this>");
        j.e(str, "propertyName");
        j.e(strArr, "value");
        j.e(r10, "casing");
        RealmQuery<T> realmQueryIn = realmQuery.in(str, strArr, r10);
        j.d(realmQueryIn, "this.`in`(propertyName, value, casing)");
        return realmQueryIn;
    }

    public static /* synthetic */ RealmQuery oneOf$default(RealmQuery realmQuery, String str, String[] strArr, Case r10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            r10 = Case.SENSITIVE;
        }
        return oneOf(realmQuery, str, strArr, r10);
    }

    public static final <T extends RealmModel> RealmQuery<T> oneOf(RealmQuery<T> realmQuery, String str, Byte[] bArr) {
        j.e(realmQuery, "<this>");
        j.e(str, "propertyName");
        j.e(bArr, "value");
        RealmQuery<T> realmQueryIn = realmQuery.in(str, bArr);
        j.d(realmQueryIn, "this.`in`(propertyName, value)");
        return realmQueryIn;
    }

    public static final <T extends RealmModel> RealmQuery<T> oneOf(RealmQuery<T> realmQuery, String str, Short[] shArr) {
        j.e(realmQuery, "<this>");
        j.e(str, "propertyName");
        j.e(shArr, "value");
        RealmQuery<T> realmQueryIn = realmQuery.in(str, shArr);
        j.d(realmQueryIn, "this.`in`(propertyName, value)");
        return realmQueryIn;
    }

    public static final <T extends RealmModel> RealmQuery<T> oneOf(RealmQuery<T> realmQuery, String str, Integer[] numArr) {
        j.e(realmQuery, "<this>");
        j.e(str, "propertyName");
        j.e(numArr, "value");
        RealmQuery<T> realmQueryIn = realmQuery.in(str, numArr);
        j.d(realmQueryIn, "this.`in`(propertyName, value)");
        return realmQueryIn;
    }

    public static final <T extends RealmModel> RealmQuery<T> oneOf(RealmQuery<T> realmQuery, String str, Long[] lArr) {
        j.e(realmQuery, "<this>");
        j.e(str, "propertyName");
        j.e(lArr, "value");
        RealmQuery<T> realmQueryIn = realmQuery.in(str, lArr);
        j.d(realmQueryIn, "this.`in`(propertyName, value)");
        return realmQueryIn;
    }

    public static final <T extends RealmModel> RealmQuery<T> oneOf(RealmQuery<T> realmQuery, String str, Double[] dArr) {
        j.e(realmQuery, "<this>");
        j.e(str, "propertyName");
        j.e(dArr, "value");
        RealmQuery<T> realmQueryIn = realmQuery.in(str, dArr);
        j.d(realmQueryIn, "this.`in`(propertyName, value)");
        return realmQueryIn;
    }

    public static final <T extends RealmModel> RealmQuery<T> oneOf(RealmQuery<T> realmQuery, String str, Float[] fArr) {
        j.e(realmQuery, "<this>");
        j.e(str, "propertyName");
        j.e(fArr, "value");
        RealmQuery<T> realmQueryIn = realmQuery.in(str, fArr);
        j.d(realmQueryIn, "this.`in`(propertyName, value)");
        return realmQueryIn;
    }

    public static final <T extends RealmModel> RealmQuery<T> oneOf(RealmQuery<T> realmQuery, String str, Boolean[] boolArr) {
        j.e(realmQuery, "<this>");
        j.e(str, "propertyName");
        j.e(boolArr, "value");
        RealmQuery<T> realmQueryIn = realmQuery.in(str, boolArr);
        j.d(realmQueryIn, "this.`in`(propertyName, value)");
        return realmQueryIn;
    }

    public static final <T extends RealmModel> RealmQuery<T> oneOf(RealmQuery<T> realmQuery, String str, Date[] dateArr) {
        j.e(realmQuery, "<this>");
        j.e(str, "propertyName");
        j.e(dateArr, "value");
        RealmQuery<T> realmQueryIn = realmQuery.in(str, dateArr);
        j.d(realmQueryIn, "this.`in`(propertyName, value)");
        return realmQueryIn;
    }
}
