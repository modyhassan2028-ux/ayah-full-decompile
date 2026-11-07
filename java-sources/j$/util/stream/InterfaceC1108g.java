package j$.util.stream;

import j$.util.Spliterator;
import java.util.Iterator;

/* JADX INFO: renamed from: j$.util.stream.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC1108g extends AutoCloseable {
    boolean isParallel();

    Iterator iterator();

    InterfaceC1108g onClose(Runnable runnable);

    InterfaceC1108g parallel();

    InterfaceC1108g sequential();

    Spliterator spliterator();

    InterfaceC1108g unordered();
}
