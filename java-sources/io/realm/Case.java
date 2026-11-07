package io.realm;

/* JADX INFO: loaded from: classes.dex */
public enum Case {
    SENSITIVE(true),
    INSENSITIVE(false);

    private final boolean value;

    Case(boolean z10) {
        this.value = z10;
    }

    public boolean getValue() {
        return this.value;
    }
}
