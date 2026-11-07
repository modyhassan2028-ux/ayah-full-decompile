package com.squareup.moshi;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class t implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Comparable) obj).compareTo((Comparable) obj2);
    }
}
