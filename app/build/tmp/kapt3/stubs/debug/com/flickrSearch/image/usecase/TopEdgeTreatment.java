package com.flickrSearch.image.usecase;

import java.lang.System;

/**
 * This is a Top edge treatment for the bottom navigation bar, (customized from BottomAppBarTopEdgeTreatment.java)
 * which "cradles" a circular [FloatingActionButton].
 *
 *
 * This edge features a downward semi-circular cutout from the edge line. The two corners created
 * by the cutout can optionally be rounded. The circular cutout can also support a vertically offset
 * FloatingActionButton; i.e., the cut-out need not be a perfect semi-circle, but could be an arc= of
 * less than 180 degrees that does not start or finish with a vertical path. This vertical offset
 * must be positive.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\tJ(\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0006\u0010\u0014\u001a\u00020\u0006J\u0015\u0010\u0015\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0016R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/flickrSearch/image/usecase/TopEdgeTreatment;", "Lcom/google/android/material/shape/EdgeTreatment;", "menuSize", "", "fabMenuIndex", "fabMargin", "", "roundedCornerRadius", "cradleVerticalOffset", "(IIFFF)V", "fabDiameter", "Ljava/lang/Float;", "horizontalOffset", "getEdgePath", "", "length", "center", "interpolation", "shapePath", "Lcom/google/android/material/shape/ShapePath;", "getFabDiameter", "setFabDiameter", "(Ljava/lang/Float;)V", "Companion", "app_debug"})
public final class TopEdgeTreatment extends com.google.android.material.shape.EdgeTreatment {
    private final int menuSize = 0;
    private final int fabMenuIndex = 0;
    private final float fabMargin = 0.0F;
    private final float roundedCornerRadius = 0.0F;
    private final float cradleVerticalOffset = 0.0F;
    private java.lang.Float fabDiameter;
    private final float horizontalOffset = 0.0F;
    @org.jetbrains.annotations.NotNull()
    public static final com.flickrSearch.image.usecase.TopEdgeTreatment.Companion Companion = null;
    private static final java.lang.String TAG = null;
    
    public TopEdgeTreatment(int menuSize, int fabMenuIndex, float fabMargin, float roundedCornerRadius, float cradleVerticalOffset) {
        super();
    }
    
    @java.lang.Override()
    public void getEdgePath(float length, float center, float interpolation, @org.jetbrains.annotations.NotNull()
    com.google.android.material.shape.ShapePath shapePath) {
    }
    
    /**
     * Returns current fab diameter in pixels.
     */
    public final float getFabDiameter() {
        return 0.0F;
    }
    
    /**
     * Sets the fab diameter the size of the fab in pixels.
     */
    public final void setFabDiameter(@org.jetbrains.annotations.Nullable()
    java.lang.Float fabDiameter) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/flickrSearch/image/usecase/TopEdgeTreatment$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}