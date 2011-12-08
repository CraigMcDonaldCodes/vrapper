package net.sourceforge.vrapper.platform;


public interface Platform {

    TextContent getModelContent();
    TextContent getViewContent();
    CursorService getCursorService();
    SelectionService getSelectionService();
    FileService getFileService();
    ViewportService getViewportService();
    HistoryService getHistoryService();
    UserInterfaceService getUserInterfaceService();
    WorkbenchService getWorkbenchService();
    ServiceProvider getServiceProvider();
    KeyMapProvider getKeyMapProvider();
    UnderlyingEditorSettings getUnderlyingEditorSettings();
    Configuration getConfiguration();
    PlatformSpecificStateProvider getPlatformSpecificStateProvider();
    SearchAndReplaceService getSearchAndReplaceService();
}
