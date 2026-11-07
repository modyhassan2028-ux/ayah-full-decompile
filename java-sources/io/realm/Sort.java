package io.realm;

/* JADX INFO: loaded from: classes.dex */
public enum Sort {
    ASCENDING(true),
    DESCENDING(false);

    private final boolean value;

    Sort(boolean z10) {
        this.value = z10;
    }

    public boolean getValue() {
        return this.value;
    }
}
