package j$.util;

import java.util.SortedSet;

/* JADX INFO: loaded from: classes2.dex */
public final class T extends s0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ SortedSet f18067f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(SortedSet sortedSet, java.util.Collection collection) {
        super(21, collection);
        this.f18067f = sortedSet;
    }

    @Override // j$.util.s0, j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        return this.f18067f.comparator();
    }
}
