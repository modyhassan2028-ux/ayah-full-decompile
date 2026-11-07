package com.squareup.moshi.adapters;

import V8.d;
import android.support.v4.media.session.p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.i;
import com.squareup.moshi.m;
import com.squareup.moshi.n;
import com.squareup.moshi.s;
import java.lang.Enum;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class EnumJsonAdapter<T extends Enum<T>> extends JsonAdapter<T> {
    final T[] constants;
    final Class<T> enumType;
    final T fallbackValue;
    final String[] nameStrings;
    final m options;
    final boolean useFallbackValue;

    public EnumJsonAdapter(Class<T> cls, T t2, boolean z10) {
        this.enumType = cls;
        this.fallbackValue = t2;
        this.useFallbackValue = z10;
        try {
            T[] enumConstants = cls.getEnumConstants();
            this.constants = enumConstants;
            this.nameStrings = new String[enumConstants.length];
            int i10 = 0;
            while (true) {
                T[] tArr = this.constants;
                if (i10 >= tArr.length) {
                    this.options = m.a(this.nameStrings);
                    return;
                }
                String strName = tArr[i10].name();
                String[] strArr = this.nameStrings;
                Field field = cls.getField(strName);
                Set set = d.f8425a;
                i iVar = (i) field.getAnnotation(i.class);
                if (iVar != null) {
                    String strName2 = iVar.name();
                    if (!"\u0000".equals(strName2)) {
                        strName = strName2;
                    }
                }
                strArr[i10] = strName;
                i10++;
            }
        } catch (NoSuchFieldException e10) {
            throw new AssertionError("Missing field in ".concat(cls.getName()), e10);
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object a(n nVar) {
        int iX = nVar.X(this.options);
        if (iX != -1) {
            return this.constants[iX];
        }
        String strS = nVar.s();
        if (this.useFallbackValue) {
            if (nVar.N() == 6) {
                nVar.c0();
                return this.fallbackValue;
            }
            throw new A6.a("Expected a string but was " + p.G(nVar.N()) + " at path " + strS);
        }
        throw new A6.a("Expected one of " + Arrays.asList(this.nameStrings) + " but was " + nVar.L() + " at path " + strS);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void e(s sVar, Object obj) {
        Enum r10 = (Enum) obj;
        if (r10 == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        sVar.N(this.nameStrings[r10.ordinal()]);
    }

    public final String toString() {
        return "EnumJsonAdapter(" + this.enumType.getName() + ")";
    }
}
